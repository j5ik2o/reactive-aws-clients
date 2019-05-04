// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListCollectionsResponseBuilderOps(val self: ListCollectionsResponse.Builder) extends AnyVal {

  final def collectionIdsAsScala(value: Option[Seq[String]]): ListCollectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.collectionIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListCollectionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def faceModelVersionsAsScala(value: Option[Seq[String]]): ListCollectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceModelVersions(v.asJava)
    }
  }

}

final class ListCollectionsResponseOps(val self: ListCollectionsResponse) extends AnyVal {

  final def collectionIdsAsScala: Option[Seq[String]] = Option(self.collectionIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def faceModelVersionsAsScala: Option[Seq[String]] = Option(self.faceModelVersions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListCollectionsResponseOps {

  implicit def toListCollectionsResponseBuilderOps(
      v: ListCollectionsResponse.Builder
  ): ListCollectionsResponseBuilderOps = new ListCollectionsResponseBuilderOps(v)

  implicit def toListCollectionsResponseOps(v: ListCollectionsResponse): ListCollectionsResponseOps =
    new ListCollectionsResponseOps(v)

}
