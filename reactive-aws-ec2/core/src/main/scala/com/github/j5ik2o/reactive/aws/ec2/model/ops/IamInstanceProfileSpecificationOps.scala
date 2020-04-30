// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IamInstanceProfileSpecificationBuilderOps(val self: IamInstanceProfileSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala(value: Option[String]): IamInstanceProfileSpecification.Builder = {
            value.fold(self){ v => self.arn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala(value: Option[String]): IamInstanceProfileSpecification.Builder = {
            value.fold(self){ v => self.name(v) }
            } 


}

final class IamInstanceProfileSpecificationOps(val self: IamInstanceProfileSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala: Option[String] = Option(self.arn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala: Option[String] = Option(self.name) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIamInstanceProfileSpecificationOps {

implicit def toIamInstanceProfileSpecificationBuilderOps(v: IamInstanceProfileSpecification.Builder): IamInstanceProfileSpecificationBuilderOps = new IamInstanceProfileSpecificationBuilderOps(v)

implicit def toIamInstanceProfileSpecificationOps(v: IamInstanceProfileSpecification): IamInstanceProfileSpecificationOps = new IamInstanceProfileSpecificationOps(v)

}

