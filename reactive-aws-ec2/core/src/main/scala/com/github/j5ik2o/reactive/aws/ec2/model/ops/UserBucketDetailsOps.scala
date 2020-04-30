// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UserBucketDetailsBuilderOps(val self: UserBucketDetails.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala(value: Option[String]): UserBucketDetails.Builder = {
            value.fold(self){ v => self.s3Bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3KeyAsScala(value: Option[String]): UserBucketDetails.Builder = {
            value.fold(self){ v => self.s3Key(v) }
            } 


}

final class UserBucketDetailsOps(val self: UserBucketDetails) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala: Option[String] = Option(self.s3Bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3KeyAsScala: Option[String] = Option(self.s3Key) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserBucketDetailsOps {

implicit def toUserBucketDetailsBuilderOps(v: UserBucketDetails.Builder): UserBucketDetailsBuilderOps = new UserBucketDetailsBuilderOps(v)

implicit def toUserBucketDetailsOps(v: UserBucketDetails): UserBucketDetailsOps = new UserBucketDetailsOps(v)

}

