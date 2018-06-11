public class MyDonorVisitor extends DonorQueryBaseVisitor<Object> {

    @Override public Object visitNewq(DonorQueryParser.NewqContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFrom(DonorQueryParser.FromContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTimestamp(DonorQueryParser.TimestampContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTime(DonorQueryParser.TimeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDate(DonorQueryParser.DateContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRating(DonorQueryParser.RatingContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFind(DonorQueryParser.FindContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDonate(DonorQueryParser.DonateContext ctx) { return visitChildren(ctx); }

    @Override public Object visitWhere(DonorQueryParser.WhereContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCondition(DonorQueryParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReport(DonorQueryParser.ReportContext ctx) { return visitChildren(ctx); }


}
