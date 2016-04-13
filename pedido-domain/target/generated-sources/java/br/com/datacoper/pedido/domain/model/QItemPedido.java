package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QItemPedido is a Querydsl query type for ItemPedido
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QItemPedido extends EntityPathBase<ItemPedido> {

    private static final long serialVersionUID = 504329776L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemPedido itemPedido = new QItemPedido("itemPedido");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final QProduto pedido;

    public final SimplePath<gumga.framework.domain.domains.GumgaMoney> precoUnitario = createSimple("precoUnitario", gumga.framework.domain.domains.GumgaMoney.class);

    public final NumberPath<java.math.BigDecimal> quantidade = createNumber("quantidade", java.math.BigDecimal.class);

    public final SimplePath<gumga.framework.domain.domains.GumgaMoney> valorTotal = createSimple("valorTotal", gumga.framework.domain.domains.GumgaMoney.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QItemPedido(String variable) {
        this(ItemPedido.class, forVariable(variable), INITS);
    }

    public QItemPedido(Path<? extends ItemPedido> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemPedido(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemPedido(PathMetadata<?> metadata, PathInits inits) {
        this(ItemPedido.class, metadata, inits);
    }

    public QItemPedido(Class<? extends ItemPedido> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pedido = inits.isInitialized("pedido") ? new QProduto(forProperty("pedido"), inits.get("pedido")) : null;
    }

}

