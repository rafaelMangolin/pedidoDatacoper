package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProduto is a Querydsl query type for Produto
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProduto extends EntityPathBase<Produto> {

    private static final long serialVersionUID = -2054553599L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduto produto = new QProduto("produto");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final QCategoria categoria;

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final SimplePath<gumga.framework.domain.domains.GumgaMoney> preco = createSimple("preco", gumga.framework.domain.domains.GumgaMoney.class);

    public final EnumPath<UnidadeMed> unidadeMedida = createEnum("unidadeMedida", UnidadeMed.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QProduto(String variable) {
        this(Produto.class, forVariable(variable), INITS);
    }

    public QProduto(Path<? extends Produto> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProduto(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProduto(PathMetadata<?> metadata, PathInits inits) {
        this(Produto.class, metadata, inits);
    }

    public QProduto(Class<? extends Produto> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.categoria = inits.isInitialized("categoria") ? new QCategoria(forProperty("categoria")) : null;
    }

}

