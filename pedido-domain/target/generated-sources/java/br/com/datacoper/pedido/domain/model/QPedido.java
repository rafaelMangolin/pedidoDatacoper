package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPedido is a Querydsl query type for Pedido
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPedido extends EntityPathBase<Pedido> {

    private static final long serialVersionUID = 59942205L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPedido pedido = new QPedido("pedido");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final DateTimePath<java.util.Date> data = createDateTime("data", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ItemPedido, QItemPedido> itensPedido = this.<ItemPedido, QItemPedido>createList("itensPedido", ItemPedido.class, QItemPedido.class, PathInits.DIRECT2);

    public final StringPath observacao = createString("observacao");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final QPessoa pessoa;

    public final EnumPath<TipoOperacao> tipoOperacao = createEnum("tipoOperacao", TipoOperacao.class);

    public final SimplePath<gumga.framework.domain.domains.GumgaMoney> valorTotal = createSimple("valorTotal", gumga.framework.domain.domains.GumgaMoney.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QPedido(String variable) {
        this(Pedido.class, forVariable(variable), INITS);
    }

    public QPedido(Path<? extends Pedido> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPedido(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPedido(PathMetadata<?> metadata, PathInits inits) {
        this(Pedido.class, metadata, inits);
    }

    public QPedido(Class<? extends Pedido> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pessoa = inits.isInitialized("pessoa") ? new QPessoa(forProperty("pessoa")) : null;
    }

}

