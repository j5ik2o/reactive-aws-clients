// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AvailableCapacityBuilderOps(val self: AvailableCapacity.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availableInstanceCapacityAsScala(value: Option[Seq[InstanceCapacity]]): AvailableCapacity.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availableInstanceCapacity(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availableVCpusAsScala(value: Option[Int]): AvailableCapacity.Builder = {
            value.fold(self){ v => self.availableVCpus(v) }
            } 


}

final class AvailableCapacityOps(val self: AvailableCapacity) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def availableInstanceCapacityAsScala: Option[Seq[InstanceCapacity]] = Option(self.availableInstanceCapacity).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availableVCpusAsScala: Option[Int] = Option(self.availableVCpus) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAvailableCapacityOps {

implicit def toAvailableCapacityBuilderOps(v: AvailableCapacity.Builder): AvailableCapacityBuilderOps = new AvailableCapacityBuilderOps(v)

implicit def toAvailableCapacityOps(v: AvailableCapacity): AvailableCapacityOps = new AvailableCapacityOps(v)

}

