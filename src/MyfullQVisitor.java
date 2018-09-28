/**
 * Created by User on 9/26/2018.
 */
public class MyfullQVisitor extends fullQBaseVisitor {

    @Override
    public Object visitNewq(fullQParser.NewqContext ctx) {

        System.out.println(ctx);
        visitChildren(ctx);
        return ctx;
    }

    @Override
    public Object visitAggregator(fullQParser.AggregatorContext ctx) {

        System.out.println("Aggregator visited");

        return visitChildren(ctx);
    }

}
