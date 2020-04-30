// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceResponseBuilderOps(val self: ImportInstanceResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conversionTaskAsScala(value: Option[ConversionTask]): ImportInstanceResponse.Builder = {
            value.fold(self){ v => self.conversionTask(v) }
            } 


}

final class ImportInstanceResponseOps(val self: ImportInstanceResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conversionTaskAsScala: Option[ConversionTask] = Option(self.conversionTask) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceResponseOps {

implicit def toImportInstanceResponseBuilderOps(v: ImportInstanceResponse.Builder): ImportInstanceResponseBuilderOps = new ImportInstanceResponseBuilderOps(v)

implicit def toImportInstanceResponseOps(v: ImportInstanceResponse): ImportInstanceResponseOps = new ImportInstanceResponseOps(v)

}

