// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListPlatformBranchesRequestBuilderOps(val self: ListPlatformBranchesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[SearchFilter]]): ListPlatformBranchesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala(value: Option[Int]): ListPlatformBranchesRequest.Builder = {
    value.fold(self) { v => self.maxRecords(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListPlatformBranchesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListPlatformBranchesRequestOps(val self: ListPlatformBranchesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[SearchFilter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPlatformBranchesRequestOps {

  implicit def toListPlatformBranchesRequestBuilderOps(
      v: ListPlatformBranchesRequest.Builder
  ): ListPlatformBranchesRequestBuilderOps = new ListPlatformBranchesRequestBuilderOps(v)

  implicit def toListPlatformBranchesRequestOps(v: ListPlatformBranchesRequest): ListPlatformBranchesRequestOps =
    new ListPlatformBranchesRequestOps(v)

}
