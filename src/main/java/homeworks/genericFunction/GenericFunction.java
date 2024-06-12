package homeworks.genericFunction;

@FunctionalInterface
public interface GenericFunction<R> {

    Integer apply(R r);
}
