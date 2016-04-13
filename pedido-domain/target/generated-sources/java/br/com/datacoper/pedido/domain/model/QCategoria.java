package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCategoria is a Querydsl query type for Categoria
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCategoria extends EntityPathBase<Categoria> {

    private static final long serialVersionUID = -418844613L;

    public static final QCategoria categoria = new QCategoria("categoria");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final NumberPath<Integer> codigoInterno = createNumber("codigoInterno", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QCategoria(String variable) {
        super(Categoria.class, forVariable(variable));
    }

    public QCategoria(Path<? extends Categoria> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategoria(PathMetadata<?> metadata) {
        super(Categoria.class, metadata);
    }

}

