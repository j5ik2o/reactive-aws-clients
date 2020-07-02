// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectsResponseBuilderOps(val self: DeleteObjectsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedAsScala(value: Option[Seq[DeletedObject]]): DeleteObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deleted(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): DeleteObjectsResponse.Builder = {
    value.fold(self) { v => self.requestCharged(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorsAsScala(value: Option[Seq[S3Error]]): DeleteObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.errors(v.asJava)
    }
  }

}

final class DeleteObjectsResponseOps(val self: DeleteObjectsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedAsScala: Option[Seq[DeletedObject]] =
    Option(self.deleted).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorsAsScala: Option[Seq[S3Error]] =
    Option(self.errors).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectsResponseOps {

  implicit def toDeleteObjectsResponseBuilderOps(v: DeleteObjectsResponse.Builder): DeleteObjectsResponseBuilderOps =
    new DeleteObjectsResponseBuilderOps(v)

  implicit def toDeleteObjectsResponseOps(v: DeleteObjectsResponse): DeleteObjectsResponseOps =
    new DeleteObjectsResponseOps(v)

}
