package br.com.datacoper.pedido.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = 60399007L;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final SimplePath<gumga.framework.domain.domains.GumgaCPF> cpf = createSimple("cpf", gumga.framework.domain.domains.GumgaCPF.class);

    public final DateTimePath<java.util.Date> dataNascimento = createDateTime("dataNascimento", java.util.Date.class);

    public final StringPath docReg = createString("docReg");

    public final SimplePath<gumga.framework.domain.domains.GumgaEMail> email = createSimple("email", gumga.framework.domain.domains.GumgaEMail.class);

    public final SimplePath<gumga.framework.domain.domains.GumgaAddress> endereco = createSimple("endereco", gumga.framework.domain.domains.GumgaAddress.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final ListPath<Papel, QPapel> papeis = this.<Papel, QPapel>createList("papeis", Papel.class, QPapel.class, PathInits.DIRECT2);

    public final EnumPath<Sexo> sexo = createEnum("sexo", Sexo.class);

    public final SimplePath<gumga.framework.domain.domains.GumgaPhoneNumber> telefone = createSimple("telefone", gumga.framework.domain.domains.GumgaPhoneNumber.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QPessoa(String variable) {
        super(Pessoa.class, forVariable(variable));
    }

    public QPessoa(Path<? extends Pessoa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoa(PathMetadata<?> metadata) {
        super(Pessoa.class, metadata);
    }

}

