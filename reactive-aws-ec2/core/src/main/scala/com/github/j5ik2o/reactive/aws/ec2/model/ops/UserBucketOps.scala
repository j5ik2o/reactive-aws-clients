// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UserBucketBuilderOps(val self: UserBucket.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala(value: Option[String]): UserBucket.Builder = {
            value.fold(self){ v => self.s3Bucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3KeyAsScala(value: Option[String]): UserBucket.Builder = {
            value.fold(self){ v => self.s3Key(v) }
            } 


}

final class UserBucketOps(val self: UserBucket) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3BucketAsScala: Option[String] = Option(self.s3Bucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def s3KeyAsScala: Option[String] = Option(self.s3Key) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserBucketOps {

implicit def toUserBucketBuilderOps(v: UserBucket.Builder): UserBucketBuilderOps = new UserBucketBuilderOps(v)

implicit def toUserBucketOps(v: UserBucket): UserBucketOps = new UserBucketOps(v)

}

