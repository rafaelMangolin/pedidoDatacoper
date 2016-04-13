package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMunif is a Querydsl query type for Munif
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMunif extends EntityPathBase<Munif> {

    private static final long serialVersionUID = -2078560661L;

    public static final QMunif munif = new QMunif("munif");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QMunif(String variable) {
        super(Munif.class, forVariable(variable));
    }

    public QMunif(Path<? extends Munif> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMunif(PathMetadata<?> metadata) {
        super(Munif.class, metadata);
    }

}

