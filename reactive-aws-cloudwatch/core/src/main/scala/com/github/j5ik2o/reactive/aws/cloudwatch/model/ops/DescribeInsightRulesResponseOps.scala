// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeInsightRulesResponseBuilderOps(val self: DescribeInsightRulesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInsightRulesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insightRulesAsScala(value: Option[Seq[InsightRule]]): DescribeInsightRulesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.insightRules(v.asJava)
    }
  }

}

final class DescribeInsightRulesResponseOps(val self: DescribeInsightRulesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insightRulesAsScala: Option[Seq[InsightRule]] = Option(self.insightRules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInsightRulesResponseOps {

  implicit def toDescribeInsightRulesResponseBuilderOps(
      v: DescribeInsightRulesResponse.Builder
  ): DescribeInsightRulesResponseBuilderOps = new DescribeInsightRulesResponseBuilderOps(v)

  implicit def toDescribeInsightRulesResponseOps(v: DescribeInsightRulesResponse): DescribeInsightRulesResponseOps =
    new DescribeInsightRulesResponseOps(v)

}
