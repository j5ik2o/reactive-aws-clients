// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListPlatformVersionsResponseBuilderOps(val self: ListPlatformVersionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryListAsScala(value: Option[Seq[PlatformSummary]]): ListPlatformVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.platformSummaryList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListPlatformVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListPlatformVersionsResponseOps(val self: ListPlatformVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformSummaryListAsScala: Option[Seq[PlatformSummary]] = Option(self.platformSummaryList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPlatformVersionsResponseOps {

  implicit def toListPlatformVersionsResponseBuilderOps(
      v: ListPlatformVersionsResponse.Builder
  ): ListPlatformVersionsResponseBuilderOps = new ListPlatformVersionsResponseBuilderOps(v)

  implicit def toListPlatformVersionsResponseOps(v: ListPlatformVersionsResponse): ListPlatformVersionsResponseOps =
    new ListPlatformVersionsResponseOps(v)

}
