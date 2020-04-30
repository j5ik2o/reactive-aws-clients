// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VCpuInfoBuilderOps(val self: VCpuInfo.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultVCpusAsScala(value: Option[Int]): VCpuInfo.Builder = {
            value.fold(self){ v => self.defaultVCpus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultCoresAsScala(value: Option[Int]): VCpuInfo.Builder = {
            value.fold(self){ v => self.defaultCores(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultThreadsPerCoreAsScala(value: Option[Int]): VCpuInfo.Builder = {
            value.fold(self){ v => self.defaultThreadsPerCore(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validCoresAsScala(value: Option[Seq[Int]]): VCpuInfo.Builder = {
                value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.validCores(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validThreadsPerCoreAsScala(value: Option[Seq[Int]]): VCpuInfo.Builder = {
                value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.validThreadsPerCore(v.asJava) } 
            }


}

final class VCpuInfoOps(val self: VCpuInfo) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultVCpusAsScala: Option[Int] = Option(self.defaultVCpus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultCoresAsScala: Option[Int] = Option(self.defaultCores) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def defaultThreadsPerCoreAsScala: Option[Int] = Option(self.defaultThreadsPerCore) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def validCoresAsScala: Option[Seq[Int]] = Option(self.validCores).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.intValue()) } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def validThreadsPerCoreAsScala: Option[Seq[Int]] = Option(self.validThreadsPerCore).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.intValue()) } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVCpuInfoOps {

implicit def toVCpuInfoBuilderOps(v: VCpuInfo.Builder): VCpuInfoBuilderOps = new VCpuInfoBuilderOps(v)

implicit def toVCpuInfoOps(v: VCpuInfo): VCpuInfoOps = new VCpuInfoOps(v)

}

