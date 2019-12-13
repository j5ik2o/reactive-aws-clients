// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteInsightRulesRequestBuilderOps(val self: DeleteInsightRulesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala(value: Option[Seq[String]]): DeleteInsightRulesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ruleNames(v.asJava)
    }
  }

}

final class DeleteInsightRulesRequestOps(val self: DeleteInsightRulesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala: Option[Seq[String]] = Option(self.ruleNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteInsightRulesRequestOps {

  implicit def toDeleteInsightRulesRequestBuilderOps(
      v: DeleteInsightRulesRequest.Builder
  ): DeleteInsightRulesRequestBuilderOps = new DeleteInsightRulesRequestBuilderOps(v)

  implicit def toDeleteInsightRulesRequestOps(v: DeleteInsightRulesRequest): DeleteInsightRulesRequestOps =
    new DeleteInsightRulesRequestOps(v)

}
