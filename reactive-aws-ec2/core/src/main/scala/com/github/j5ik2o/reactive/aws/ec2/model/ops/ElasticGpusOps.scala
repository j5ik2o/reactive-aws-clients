// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpusBuilderOps(val self: ElasticGpus.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuIdAsScala(value: Option[String]): ElasticGpus.Builder = {
            value.fold(self){ v => self.elasticGpuId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): ElasticGpus.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuTypeAsScala(value: Option[String]): ElasticGpus.Builder = {
            value.fold(self){ v => self.elasticGpuType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuHealthAsScala(value: Option[ElasticGpuHealth]): ElasticGpus.Builder = {
            value.fold(self){ v => self.elasticGpuHealth(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuStateAsScala(value: Option[ElasticGpuState]): ElasticGpus.Builder = {
            value.fold(self){ v => self.elasticGpuState(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): ElasticGpus.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): ElasticGpus.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class ElasticGpusOps(val self: ElasticGpus) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuIdAsScala: Option[String] = Option(self.elasticGpuId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuTypeAsScala: Option[String] = Option(self.elasticGpuType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuHealthAsScala: Option[ElasticGpuHealth] = Option(self.elasticGpuHealth) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuStateAsScala: Option[ElasticGpuState] = Option(self.elasticGpuState) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpusOps {

implicit def toElasticGpusBuilderOps(v: ElasticGpus.Builder): ElasticGpusBuilderOps = new ElasticGpusBuilderOps(v)

implicit def toElasticGpusOps(v: ElasticGpus): ElasticGpusOps = new ElasticGpusOps(v)

}

