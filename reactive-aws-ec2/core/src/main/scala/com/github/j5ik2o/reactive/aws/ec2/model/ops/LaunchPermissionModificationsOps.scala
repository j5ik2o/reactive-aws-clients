// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchPermissionModificationsBuilderOps(val self: LaunchPermissionModifications.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def addAsScala(value: Option[Seq[LaunchPermission]]): LaunchPermissionModifications.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.add(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def removeAsScala(value: Option[Seq[LaunchPermission]]): LaunchPermissionModifications.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.remove(v.asJava) } 
            }


}

final class LaunchPermissionModificationsOps(val self: LaunchPermissionModifications) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def addAsScala: Option[Seq[LaunchPermission]] = Option(self.add).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def removeAsScala: Option[Seq[LaunchPermission]] = Option(self.remove).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchPermissionModificationsOps {

implicit def toLaunchPermissionModificationsBuilderOps(v: LaunchPermissionModifications.Builder): LaunchPermissionModificationsBuilderOps = new LaunchPermissionModificationsBuilderOps(v)

implicit def toLaunchPermissionModificationsOps(v: LaunchPermissionModifications): LaunchPermissionModificationsOps = new LaunchPermissionModificationsOps(v)

}

