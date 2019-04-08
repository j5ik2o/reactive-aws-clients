// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListPlatformVersionsResponseBuilderOps(val self: ListPlatformVersionsResponse.Builder) extends AnyVal {

  final def platformSummaryListAsScala(value: Option[Seq[PlatformSummary]]): ListPlatformVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.platformSummaryList(v.asJava)
    } // Seq[PlatformSummary]
  }

  final def nextTokenAsScala(value: Option[String]): ListPlatformVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListPlatformVersionsResponseOps(val self: ListPlatformVersionsResponse) extends AnyVal {

  final def platformSummaryListAsScala: Option[Seq[PlatformSummary]] = Option(self.platformSummaryList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[PlatformSummary]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPlatformVersionsResponseOps {

  implicit def toListPlatformVersionsResponseBuilderOps(
      v: ListPlatformVersionsResponse.Builder
  ): ListPlatformVersionsResponseBuilderOps = new ListPlatformVersionsResponseBuilderOps(v)

  implicit def toListPlatformVersionsResponseOps(v: ListPlatformVersionsResponse): ListPlatformVersionsResponseOps =
    new ListPlatformVersionsResponseOps(v)

}
