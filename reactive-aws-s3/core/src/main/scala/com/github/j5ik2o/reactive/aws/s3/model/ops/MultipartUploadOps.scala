// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MultipartUploadBuilderOps(val self: MultipartUpload.Builder) extends AnyVal {

  final def uploadIdAsScala(value: Option[String]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def keyAsScala(value: Option[String]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def initiatedAsScala(value: Option[java.time.Instant]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.initiated(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def ownerAsScala(value: Option[Owner]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  final def initiatorAsScala(value: Option[Initiator]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  }

}

final class MultipartUploadOps(val self: MultipartUpload) extends AnyVal {

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def keyAsScala: Option[String] = Option(self.key)

  final def initiatedAsScala: Option[java.time.Instant] = Option(self.initiated)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def ownerAsScala: Option[Owner] = Option(self.owner)

  final def initiatorAsScala: Option[Initiator] = Option(self.initiator)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMultipartUploadOps {

  implicit def toMultipartUploadBuilderOps(v: MultipartUpload.Builder): MultipartUploadBuilderOps =
    new MultipartUploadBuilderOps(v)

  implicit def toMultipartUploadOps(v: MultipartUpload): MultipartUploadOps = new MultipartUploadOps(v)

}
