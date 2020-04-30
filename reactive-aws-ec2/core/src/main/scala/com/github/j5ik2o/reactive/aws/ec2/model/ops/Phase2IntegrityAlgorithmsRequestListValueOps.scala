// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2IntegrityAlgorithmsRequestListValueBuilderOps(val self: Phase2IntegrityAlgorithmsRequestListValue.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): Phase2IntegrityAlgorithmsRequestListValue.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class Phase2IntegrityAlgorithmsRequestListValueOps(val self: Phase2IntegrityAlgorithmsRequestListValue) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2IntegrityAlgorithmsRequestListValueOps {

implicit def toPhase2IntegrityAlgorithmsRequestListValueBuilderOps(v: Phase2IntegrityAlgorithmsRequestListValue.Builder): Phase2IntegrityAlgorithmsRequestListValueBuilderOps = new Phase2IntegrityAlgorithmsRequestListValueBuilderOps(v)

implicit def toPhase2IntegrityAlgorithmsRequestListValueOps(v: Phase2IntegrityAlgorithmsRequestListValue): Phase2IntegrityAlgorithmsRequestListValueOps = new Phase2IntegrityAlgorithmsRequestListValueOps(v)

}

