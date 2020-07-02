// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformBranchSummaryBuilderOps(val self: PlatformBranchSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala(value: Option[String]): PlatformBranchSummary.Builder = {
    value.fold(self) { v => self.platformName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def branchNameAsScala(value: Option[String]): PlatformBranchSummary.Builder = {
    value.fold(self) { v => self.branchName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleStateAsScala(value: Option[String]): PlatformBranchSummary.Builder = {
    value.fold(self) { v => self.lifecycleState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def branchOrderAsScala(value: Option[Int]): PlatformBranchSummary.Builder = {
    value.fold(self) { v => self.branchOrder(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedTierListAsScala(value: Option[Seq[String]]): PlatformBranchSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedTierList(v.asJava)
    }
  }

}

final class PlatformBranchSummaryOps(val self: PlatformBranchSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala: Option[String] = Option(self.platformName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def branchNameAsScala: Option[String] = Option(self.branchName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleStateAsScala: Option[String] = Option(self.lifecycleState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def branchOrderAsScala: Option[Int] = Option(self.branchOrder)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedTierListAsScala: Option[Seq[String]] =
    Option(self.supportedTierList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformBranchSummaryOps {

  implicit def toPlatformBranchSummaryBuilderOps(v: PlatformBranchSummary.Builder): PlatformBranchSummaryBuilderOps =
    new PlatformBranchSummaryBuilderOps(v)

  implicit def toPlatformBranchSummaryOps(v: PlatformBranchSummary): PlatformBranchSummaryOps =
    new PlatformBranchSummaryOps(v)

}
