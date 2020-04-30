// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreditSpecificationRequestBuilderOps(val self: CreditSpecificationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala(value: Option[String]): CreditSpecificationRequest.Builder = {
            value.fold(self){ v => self.cpuCredits(v) }
            } 


}

final class CreditSpecificationRequestOps(val self: CreditSpecificationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreditSpecificationRequestOps {

implicit def toCreditSpecificationRequestBuilderOps(v: CreditSpecificationRequest.Builder): CreditSpecificationRequestBuilderOps = new CreditSpecificationRequestBuilderOps(v)

implicit def toCreditSpecificationRequestOps(v: CreditSpecificationRequest): CreditSpecificationRequestOps = new CreditSpecificationRequestOps(v)

}

