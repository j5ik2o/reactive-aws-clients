// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LoggingEnabledBuilderOps(val self: LoggingEnabled.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetBucketAsScala(value: Option[String]): LoggingEnabled.Builder = {
            value.fold(self){ v => self.targetBucket(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetGrantsAsScala(value: Option[Seq[TargetGrant]]): LoggingEnabled.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.targetGrants(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetPrefixAsScala(value: Option[String]): LoggingEnabled.Builder = {
            value.fold(self){ v => self.targetPrefix(v) }
            } 


}

final class LoggingEnabledOps(val self: LoggingEnabled) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetBucketAsScala: Option[String] = Option(self.targetBucket) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def targetGrantsAsScala: Option[Seq[TargetGrant]] = Option(self.targetGrants).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetPrefixAsScala: Option[String] = Option(self.targetPrefix) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoggingEnabledOps {

implicit def toLoggingEnabledBuilderOps(v: LoggingEnabled.Builder): LoggingEnabledBuilderOps = new LoggingEnabledBuilderOps(v)

implicit def toLoggingEnabledOps(v: LoggingEnabled): LoggingEnabledOps = new LoggingEnabledOps(v)

}

