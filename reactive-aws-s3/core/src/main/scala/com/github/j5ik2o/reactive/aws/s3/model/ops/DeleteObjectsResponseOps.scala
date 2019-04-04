// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectsResponseBuilderOps(val self: DeleteObjectsResponse.Builder) extends AnyVal {

  final def withDeletedAsScala(value: Option[Seq[DeletedObject]]): DeleteObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.deleted(v.asJava)
    } // Seq[DeletedObject]
  }

  final def withRequestChargedAsScala(value: Option[RequestCharged]): DeleteObjectsResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

  final def withErrorsAsScala(value: Option[Seq[S3Error]]): DeleteObjectsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.errors(v.asJava)
    } // Seq[S3Error]
  }

}

final class DeleteObjectsResponseOps(val self: DeleteObjectsResponse) extends AnyVal {

  final def deletedAsScala: Option[Seq[DeletedObject]] = Option(self.deleted).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[DeletedObject]

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

  final def errorsAsScala: Option[Seq[S3Error]] = Option(self.errors).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[S3Error]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectsResponseOps {

  implicit def toDeleteObjectsResponseBuilderOps(v: DeleteObjectsResponse.Builder): DeleteObjectsResponseBuilderOps =
    new DeleteObjectsResponseBuilderOps(v)

  implicit def toDeleteObjectsResponseOps(v: DeleteObjectsResponse): DeleteObjectsResponseOps =
    new DeleteObjectsResponseOps(v)

}
