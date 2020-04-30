// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreditSpecificationBuilderOps(val self: CreditSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala(value: Option[String]): CreditSpecification.Builder = {
            value.fold(self){ v => self.cpuCredits(v) }
            } 


}

final class CreditSpecificationOps(val self: CreditSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreditSpecificationOps {

implicit def toCreditSpecificationBuilderOps(v: CreditSpecification.Builder): CreditSpecificationBuilderOps = new CreditSpecificationBuilderOps(v)

implicit def toCreditSpecificationOps(v: CreditSpecification): CreditSpecificationOps = new CreditSpecificationOps(v)

}

