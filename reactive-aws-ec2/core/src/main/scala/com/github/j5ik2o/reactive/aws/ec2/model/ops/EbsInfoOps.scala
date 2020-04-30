// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EbsInfoBuilderOps(val self: EbsInfo.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedSupportAsScala(value: Option[EbsOptimizedSupport]): EbsInfo.Builder = {
            value.fold(self){ v => self.ebsOptimizedSupport(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionSupportAsScala(value: Option[EbsEncryptionSupport]): EbsInfo.Builder = {
            value.fold(self){ v => self.encryptionSupport(v) }
            } 


}

final class EbsInfoOps(val self: EbsInfo) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedSupportAsScala: Option[EbsOptimizedSupport] = Option(self.ebsOptimizedSupport) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionSupportAsScala: Option[EbsEncryptionSupport] = Option(self.encryptionSupport) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEbsInfoOps {

implicit def toEbsInfoBuilderOps(v: EbsInfo.Builder): EbsInfoBuilderOps = new EbsInfoBuilderOps(v)

implicit def toEbsInfoOps(v: EbsInfo): EbsInfoOps = new EbsInfoOps(v)

}

