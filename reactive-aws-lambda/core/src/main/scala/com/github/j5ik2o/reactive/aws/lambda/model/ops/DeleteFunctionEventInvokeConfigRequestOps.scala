// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionEventInvokeConfigRequestBuilderOps(val self: DeleteFunctionEventInvokeConfigRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def functionNameAsScala(value: Option[String]): DeleteFunctionEventInvokeConfigRequest.Builder = {
            value.fold(self){ v => self.functionName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def qualifierAsScala(value: Option[String]): DeleteFunctionEventInvokeConfigRequest.Builder = {
            value.fold(self){ v => self.qualifier(v) }
            } 


}

final class DeleteFunctionEventInvokeConfigRequestOps(val self: DeleteFunctionEventInvokeConfigRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def functionNameAsScala: Option[String] = Option(self.functionName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def qualifierAsScala: Option[String] = Option(self.qualifier) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionEventInvokeConfigRequestOps {

implicit def toDeleteFunctionEventInvokeConfigRequestBuilderOps(v: DeleteFunctionEventInvokeConfigRequest.Builder): DeleteFunctionEventInvokeConfigRequestBuilderOps = new DeleteFunctionEventInvokeConfigRequestBuilderOps(v)

implicit def toDeleteFunctionEventInvokeConfigRequestOps(v: DeleteFunctionEventInvokeConfigRequest): DeleteFunctionEventInvokeConfigRequestOps = new DeleteFunctionEventInvokeConfigRequestOps(v)

}

