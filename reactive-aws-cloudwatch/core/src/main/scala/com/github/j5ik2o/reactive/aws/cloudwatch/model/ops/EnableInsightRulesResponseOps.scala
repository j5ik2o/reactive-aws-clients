// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class EnableInsightRulesResponseBuilderOps(val self: EnableInsightRulesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[PartialFailure]]): EnableInsightRulesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class EnableInsightRulesResponseOps(val self: EnableInsightRulesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[PartialFailure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableInsightRulesResponseOps {

  implicit def toEnableInsightRulesResponseBuilderOps(
      v: EnableInsightRulesResponse.Builder
  ): EnableInsightRulesResponseBuilderOps = new EnableInsightRulesResponseBuilderOps(v)

  implicit def toEnableInsightRulesResponseOps(v: EnableInsightRulesResponse): EnableInsightRulesResponseOps =
    new EnableInsightRulesResponseOps(v)

}
