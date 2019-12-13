// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DisableInsightRulesResponseBuilderOps(val self: DisableInsightRulesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[PartialFailure]]): DisableInsightRulesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class DisableInsightRulesResponseOps(val self: DisableInsightRulesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[PartialFailure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableInsightRulesResponseOps {

  implicit def toDisableInsightRulesResponseBuilderOps(
      v: DisableInsightRulesResponse.Builder
  ): DisableInsightRulesResponseBuilderOps = new DisableInsightRulesResponseBuilderOps(v)

  implicit def toDisableInsightRulesResponseOps(v: DisableInsightRulesResponse): DisableInsightRulesResponseOps =
    new DisableInsightRulesResponseOps(v)

}
