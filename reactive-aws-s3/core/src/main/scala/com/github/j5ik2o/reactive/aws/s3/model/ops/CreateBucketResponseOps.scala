// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateBucketResponseBuilderOps(val self: CreateBucketResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationAsScala(value: Option[String]): CreateBucketResponse.Builder = {
            value.fold(self){ v => self.location(v) }
            } 


}

final class CreateBucketResponseOps(val self: CreateBucketResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def locationAsScala: Option[String] = Option(self.location) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBucketResponseOps {

implicit def toCreateBucketResponseBuilderOps(v: CreateBucketResponse.Builder): CreateBucketResponseBuilderOps = new CreateBucketResponseBuilderOps(v)

implicit def toCreateBucketResponseOps(v: CreateBucketResponse): CreateBucketResponseOps = new CreateBucketResponseOps(v)

}

