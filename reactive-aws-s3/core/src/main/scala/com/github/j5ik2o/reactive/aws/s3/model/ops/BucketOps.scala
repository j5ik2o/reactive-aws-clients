// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class BucketBuilderOps(val self: Bucket.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Bucket.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def creationDateAsScala(value: Option[java.time.Instant]): Bucket.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

}

final class BucketOps(val self: Bucket) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBucketOps {

  implicit def toBucketBuilderOps(v: Bucket.Builder): BucketBuilderOps = new BucketBuilderOps(v)

  implicit def toBucketOps(v: Bucket): BucketOps = new BucketOps(v)

}
