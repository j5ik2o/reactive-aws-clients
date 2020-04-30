// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IamInstanceProfileBuilderOps(val self: IamInstanceProfile.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala(value: Option[String]): IamInstanceProfile.Builder = {
            value.fold(self){ v => self.arn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala(value: Option[String]): IamInstanceProfile.Builder = {
            value.fold(self){ v => self.id(v) }
            } 


}

final class IamInstanceProfileOps(val self: IamInstanceProfile) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala: Option[String] = Option(self.arn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def idAsScala: Option[String] = Option(self.id) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIamInstanceProfileOps {

implicit def toIamInstanceProfileBuilderOps(v: IamInstanceProfile.Builder): IamInstanceProfileBuilderOps = new IamInstanceProfileBuilderOps(v)

implicit def toIamInstanceProfileOps(v: IamInstanceProfile): IamInstanceProfileOps = new IamInstanceProfileOps(v)

}

