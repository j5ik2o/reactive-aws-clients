// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DiskInfoBuilderOps(val self: DiskInfo.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeInGBAsScala(value: Option[Long]): DiskInfo.Builder = {
            value.fold(self){ v => self.sizeInGB(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def countAsScala(value: Option[Int]): DiskInfo.Builder = {
            value.fold(self){ v => self.count(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[DiskType]): DiskInfo.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 


}

final class DiskInfoOps(val self: DiskInfo) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sizeInGBAsScala: Option[Long] = Option(self.sizeInGB) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def countAsScala: Option[Int] = Option(self.count) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[DiskType] = Option(self.`type`) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiskInfoOps {

implicit def toDiskInfoBuilderOps(v: DiskInfo.Builder): DiskInfoBuilderOps = new DiskInfoBuilderOps(v)

implicit def toDiskInfoOps(v: DiskInfo): DiskInfoOps = new DiskInfoOps(v)

}

