// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LoadPermissionRequestBuilderOps(val self: LoadPermissionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupAsScala(value: Option[PermissionGroup]): LoadPermissionRequest.Builder = {
            value.fold(self){ v => self.group(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userIdAsScala(value: Option[String]): LoadPermissionRequest.Builder = {
            value.fold(self){ v => self.userId(v) }
            } 


}

final class LoadPermissionRequestOps(val self: LoadPermissionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupAsScala: Option[PermissionGroup] = Option(self.group) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userIdAsScala: Option[String] = Option(self.userId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoadPermissionRequestOps {

implicit def toLoadPermissionRequestBuilderOps(v: LoadPermissionRequest.Builder): LoadPermissionRequestBuilderOps = new LoadPermissionRequestBuilderOps(v)

implicit def toLoadPermissionRequestOps(v: LoadPermissionRequest): LoadPermissionRequestOps = new LoadPermissionRequestOps(v)

}

