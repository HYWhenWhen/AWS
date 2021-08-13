package WhenWhen.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrivateDate is a Querydsl query type for PrivateDate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPrivateDate extends EntityPathBase<PrivateDate> {

    private static final long serialVersionUID = 825812993L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrivateDate privateDate = new QPrivateDate("privateDate");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> localDate = createDate("localDate", java.time.LocalDate.class);

    public final QMember member;

    public final StringPath name = createString("name");

    public QPrivateDate(String variable) {
        this(PrivateDate.class, forVariable(variable), INITS);
    }

    public QPrivateDate(Path<? extends PrivateDate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrivateDate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrivateDate(PathMetadata metadata, PathInits inits) {
        this(PrivateDate.class, metadata, inits);
    }

    public QPrivateDate(Class<? extends PrivateDate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

