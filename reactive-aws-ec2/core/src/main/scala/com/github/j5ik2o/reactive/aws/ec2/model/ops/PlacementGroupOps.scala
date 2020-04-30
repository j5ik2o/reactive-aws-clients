// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PlacementGroupBuilderOps(val self: PlacementGroup.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala(value: Option[String]): PlacementGroup.Builder = {
            value.fold(self){ v => self.groupName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[PlacementGroupState]): PlacementGroup.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def strategyAsScala(value: Option[PlacementStrategy]): PlacementGroup.Builder = {
            value.fold(self){ v => self.strategy(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def partitionCountAsScala(value: Option[Int]): PlacementGroup.Builder = {
            value.fold(self){ v => self.partitionCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala(value: Option[String]): PlacementGroup.Builder = {
            value.fold(self){ v => self.groupId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): PlacementGroup.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class PlacementGroupOps(val self: PlacementGroup) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala: Option[String] = Option(self.groupName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[PlacementGroupState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def strategyAsScala: Option[PlacementStrategy] = Option(self.strategy) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def partitionCountAsScala: Option[Int] = Option(self.partitionCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala: Option[String] = Option(self.groupId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementGroupOps {

implicit def toPlacementGroupBuilderOps(v: PlacementGroup.Builder): PlacementGroupBuilderOps = new PlacementGroupBuilderOps(v)

implicit def toPlacementGroupOps(v: PlacementGroup): PlacementGroupOps = new PlacementGroupOps(v)

}

