// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConnectionNotificationBuilderOps(val self: ConnectionNotification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.connectionNotificationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.serviceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointIdAsScala(value: Option[String]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.vpcEndpointId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationTypeAsScala(value: Option[ConnectionNotificationType]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.connectionNotificationType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationArnAsScala(value: Option[String]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.connectionNotificationArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionEventsAsScala(value: Option[Seq[String]]): ConnectionNotification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connectionEvents(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationStateAsScala(value: Option[ConnectionNotificationState]): ConnectionNotification.Builder = {
            value.fold(self){ v => self.connectionNotificationState(v) }
            } 


}

final class ConnectionNotificationOps(val self: ConnectionNotification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationIdAsScala: Option[String] = Option(self.connectionNotificationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala: Option[String] = Option(self.serviceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationTypeAsScala: Option[ConnectionNotificationType] = Option(self.connectionNotificationType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationArnAsScala: Option[String] = Option(self.connectionNotificationArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def connectionEventsAsScala: Option[Seq[String]] = Option(self.connectionEvents).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationStateAsScala: Option[ConnectionNotificationState] = Option(self.connectionNotificationState) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConnectionNotificationOps {

implicit def toConnectionNotificationBuilderOps(v: ConnectionNotification.Builder): ConnectionNotificationBuilderOps = new ConnectionNotificationBuilderOps(v)

implicit def toConnectionNotificationOps(v: ConnectionNotification): ConnectionNotificationOps = new ConnectionNotificationOps(v)

}

