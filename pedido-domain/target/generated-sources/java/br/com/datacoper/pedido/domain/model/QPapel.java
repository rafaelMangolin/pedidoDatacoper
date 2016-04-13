package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPapel is a Querydsl query type for Papel
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPapel extends EntityPathBase<Papel> {

    private static final long serialVersionUID = -2076384114L;

    public static final QPapel papel = new QPapel("papel");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QPapel(String variable) {
        super(Papel.class, forVariable(variable));
    }

    public QPapel(Path<? extends Papel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPapel(PathMetadata<?> metadata) {
        super(Papel.class, metadata);
    }

}

