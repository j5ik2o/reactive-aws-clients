// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class InsightRuleContributorBuilderOps(val self: InsightRuleContributor.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala(value: Option[Seq[String]]): InsightRuleContributor.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keys(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateAggregateValueAsScala(value: Option[Double]): InsightRuleContributor.Builder = {
    value.fold(self) { v =>
      self.approximateAggregateValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsAsScala(value: Option[Seq[InsightRuleContributorDatapoint]]): InsightRuleContributor.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.datapoints(v.asJava)
    }
  }

}

final class InsightRuleContributorOps(val self: InsightRuleContributor) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala: Option[Seq[String]] = Option(self.keys).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateAggregateValueAsScala: Option[Double] = Option(self.approximateAggregateValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsAsScala: Option[Seq[InsightRuleContributorDatapoint]] = Option(self.datapoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInsightRuleContributorOps {

  implicit def toInsightRuleContributorBuilderOps(v: InsightRuleContributor.Builder): InsightRuleContributorBuilderOps =
    new InsightRuleContributorBuilderOps(v)

  implicit def toInsightRuleContributorOps(v: InsightRuleContributor): InsightRuleContributorOps =
    new InsightRuleContributorOps(v)

}
