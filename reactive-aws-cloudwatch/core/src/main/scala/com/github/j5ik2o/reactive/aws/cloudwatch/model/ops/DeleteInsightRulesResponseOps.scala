// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteInsightRulesResponseBuilderOps(val self: DeleteInsightRulesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[PartialFailure]]): DeleteInsightRulesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class DeleteInsightRulesResponseOps(val self: DeleteInsightRulesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[PartialFailure]] =
    Option(self.failures).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteInsightRulesResponseOps {

  implicit def toDeleteInsightRulesResponseBuilderOps(
      v: DeleteInsightRulesResponse.Builder
  ): DeleteInsightRulesResponseBuilderOps = new DeleteInsightRulesResponseBuilderOps(v)

  implicit def toDeleteInsightRulesResponseOps(v: DeleteInsightRulesResponse): DeleteInsightRulesResponseOps =
    new DeleteInsightRulesResponseOps(v)

}
