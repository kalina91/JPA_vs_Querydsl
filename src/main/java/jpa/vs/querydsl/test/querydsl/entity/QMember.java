package jpa.vs.querydsl.test.querydsl.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMember is a Querydsl query type for QMember
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMember extends com.querydsl.sql.RelationalPathBase<QMember> {

    private static final long serialVersionUID = -892677667;

    public static final QMember member = new QMember("member");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QMember> memberPkey = createPrimaryKey(id);

    public QMember(String variable) {
        super(QMember.class, forVariable(variable), "public", "member");
        addMetadata();
    }

    public QMember(String variable, String schema, String table) {
        super(QMember.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMember(String variable, String schema) {
        super(QMember.class, forVariable(variable), schema, "member");
        addMetadata();
    }

    public QMember(Path<? extends QMember> path) {
        super(path.getType(), path.getMetadata(), "public", "member");
        addMetadata();
    }

    public QMember(PathMetadata metadata) {
        super(QMember.class, metadata, "public", "member");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("address").withIndex(3).ofType(Types.VARCHAR).withSize(25).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(25));
    }

}

