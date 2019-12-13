// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class EnableInsightRulesRequestBuilderOps(val self: EnableInsightRulesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala(value: Option[Seq[String]]): EnableInsightRulesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ruleNames(v.asJava)
    }
  }

}

final class EnableInsightRulesRequestOps(val self: EnableInsightRulesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala: Option[Seq[String]] = Option(self.ruleNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableInsightRulesRequestOps {

  implicit def toEnableInsightRulesRequestBuilderOps(
      v: EnableInsightRulesRequest.Builder
  ): EnableInsightRulesRequestBuilderOps = new EnableInsightRulesRequestBuilderOps(v)

  implicit def toEnableInsightRulesRequestOps(v: EnableInsightRulesRequest): EnableInsightRulesRequestOps =
    new EnableInsightRulesRequestOps(v)

}
