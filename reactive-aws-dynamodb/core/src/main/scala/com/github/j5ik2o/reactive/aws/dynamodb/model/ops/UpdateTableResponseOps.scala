// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableResponseBuilderOps(val self: UpdateTableResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableDescriptionAsScala(value: Option[TableDescription]): UpdateTableResponse.Builder = {
            value.fold(self){ v => self.tableDescription(v) }
            } 


}

final class UpdateTableResponseOps(val self: UpdateTableResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableResponseOps {

implicit def toUpdateTableResponseBuilderOps(v: UpdateTableResponse.Builder): UpdateTableResponseBuilderOps = new UpdateTableResponseBuilderOps(v)

implicit def toUpdateTableResponseOps(v: UpdateTableResponse): UpdateTableResponseOps = new UpdateTableResponseOps(v)

}

