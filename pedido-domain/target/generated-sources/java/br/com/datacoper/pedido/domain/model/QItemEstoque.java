package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QItemEstoque is a Querydsl query type for ItemEstoque
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QItemEstoque extends EntityPathBase<ItemEstoque> {

    private static final long serialVersionUID = 1992491245L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemEstoque itemEstoque = new QItemEstoque("itemEstoque");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final DateTimePath<java.util.Date> data = createDateTime("data", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath local = createString("local");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final QProduto produto;

    public final NumberPath<java.math.BigDecimal> quantidade = createNumber("quantidade", java.math.BigDecimal.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QItemEstoque(String variable) {
        this(ItemEstoque.class, forVariable(variable), INITS);
    }

    public QItemEstoque(Path<? extends ItemEstoque> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemEstoque(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QItemEstoque(PathMetadata<?> metadata, PathInits inits) {
        this(ItemEstoque.class, metadata, inits);
    }

    public QItemEstoque(Class<? extends ItemEstoque> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.produto = inits.isInitialized("produto") ? new QProduto(forProperty("produto"), inits.get("produto")) : null;
    }

}

