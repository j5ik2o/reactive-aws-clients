// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListPlatformBranchesResponseBuilderOps(val self: ListPlatformBranchesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformBranchSummaryListAsScala(
      value: Option[Seq[PlatformBranchSummary]]
  ): ListPlatformBranchesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.platformBranchSummaryList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListPlatformBranchesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListPlatformBranchesResponseOps(val self: ListPlatformBranchesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformBranchSummaryListAsScala: Option[Seq[PlatformBranchSummary]] =
    Option(self.platformBranchSummaryList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPlatformBranchesResponseOps {

  implicit def toListPlatformBranchesResponseBuilderOps(
      v: ListPlatformBranchesResponse.Builder
  ): ListPlatformBranchesResponseBuilderOps = new ListPlatformBranchesResponseBuilderOps(v)

  implicit def toListPlatformBranchesResponseOps(v: ListPlatformBranchesResponse): ListPlatformBranchesResponseOps =
    new ListPlatformBranchesResponseOps(v)

}
