// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListCollectionsResponseBuilderOps(val self: ListCollectionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdsAsScala(value: Option[Seq[String]]): ListCollectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.collectionIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListCollectionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionsAsScala(value: Option[Seq[String]]): ListCollectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faceModelVersions(v.asJava)
    }
  }

}

final class ListCollectionsResponseOps(val self: ListCollectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdsAsScala: Option[Seq[String]] =
    Option(self.collectionIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionsAsScala: Option[Seq[String]] =
    Option(self.faceModelVersions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
