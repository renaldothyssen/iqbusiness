# iqbusiness
RabbitMQ producer and consumer application
This repo consists of 2 java applications which will serve as message producer and receiver service, integrating with a RabbitMQ messaging system.

### Installation
RabbitMQ
To spin up a local docker image of RabbitMQ, execute the following command in the main project directory:
docker-compose up

Expected Output

```sh
$ docker-compose up
Starting iqbusiness_rabbitmq3_1 ... done
Attaching to iqbusiness_rabbitmq3_1
rabbitmq3_1  | Configuring logger redirection
rabbitmq3_1  | 2020-11-30 12:10:56.212 [debug] <0.287.0> Lager installed handler error_logger_lager_h into error_logger
rabbitmq3_1  | 2020-11-30 12:10:56.219 [debug] <0.290.0> Lager installed handler lager_forwarder_backend into error_logger_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.219 [debug] <0.293.0> Lager installed handler lager_forwarder_backend into rabbit_log_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.219 [debug] <0.296.0> Lager installed handler lager_forwarder_backend into rabbit_log_channel_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.299.0> Lager installed handler lager_forwarder_backend into rabbit_log_connection_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.302.0> Lager installed handler lager_forwarder_backend into rabbit_log_feature_flags_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.305.0> Lager installed handler lager_forwarder_backend into rabbit_log_federation_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.308.0> Lager installed handler lager_forwarder_backend into rabbit_log_ldap_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.311.0> Lager installed handler lager_forwarder_backend into rabbit_log_mirroring_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.314.0> Lager installed handler lager_forwarder_backend into rabbit_log_prelaunch_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.317.0> Lager installed handler lager_forwarder_backend into rabbit_log_queue_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.320.0> Lager installed handler lager_forwarder_backend into rabbit_log_ra_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.323.0> Lager installed handler lager_forwarder_backend into rabbit_log_shovel_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.220 [debug] <0.326.0> Lager installed handler lager_forwarder_backend into rabbit_log_upgrade_lager_event
rabbitmq3_1  | 2020-11-30 12:10:56.262 [info] <0.44.0> Application lager started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:56.713 [debug] <0.283.0> Lager installed handler lager_backend_throttle into lager_event
rabbitmq3_1  | 2020-11-30 12:10:59.101 [info] <0.44.0> Application mnesia started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:59.101 [info] <0.272.0> 
rabbitmq3_1  |  Starting RabbitMQ 3.8.9 on Erlang 23.1.4
rabbitmq3_1  |  Copyright (c) 2007-2020 VMware, Inc. or its affiliates.
rabbitmq3_1  |  Licensed under the MPL 2.0. Website: https://rabbitmq.com
rabbitmq3_1  | 
rabbitmq3_1  |   ##  ##      RabbitMQ 3.8.9
rabbitmq3_1  |   ##  ##
rabbitmq3_1  |   ##########  Copyright (c) 2007-2020 VMware, Inc. or its affiliates.
rabbitmq3_1  |   ######  ##
rabbitmq3_1  |   ##########  Licensed under the MPL 2.0. Website: https://rabbitmq.com
rabbitmq3_1  | 
rabbitmq3_1  |   Doc guides: https://rabbitmq.com/documentation.html
rabbitmq3_1  |   Support:    https://rabbitmq.com/contact.html
rabbitmq3_1  |   Tutorials:  https://rabbitmq.com/getstarted.html
rabbitmq3_1  |   Monitoring: https://rabbitmq.com/monitoring.html
rabbitmq3_1  | 
rabbitmq3_1  |   Logs: <stdout>
rabbitmq3_1  | 
rabbitmq3_1  |   Config file(s): /etc/rabbitmq/rabbitmq.conf
rabbitmq3_1  | 
rabbitmq3_1  |   Starting broker...2020-11-30 12:10:59.102 [info] <0.272.0> 
rabbitmq3_1  |  node           : rabbit@f1f2ad88a3fe
rabbitmq3_1  |  home dir       : /var/lib/rabbitmq
rabbitmq3_1  |  config file(s) : /etc/rabbitmq/rabbitmq.conf
rabbitmq3_1  |  cookie hash    : 1TuUn/eq8hTP5Whsh12Eiw==
rabbitmq3_1  |  log(s)         : <stdout>
rabbitmq3_1  |  database dir   : /var/lib/rabbitmq/mnesia/rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:59.119 [info] <0.272.0> Running boot step pre_boot defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.119 [info] <0.272.0> Running boot step rabbit_core_metrics defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.120 [info] <0.272.0> Running boot step rabbit_alarm defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.123 [info] <0.409.0> Memory high watermark set to 12810 MiB (13433067929 bytes) of 32026 MiB (33582669824 bytes) total
rabbitmq3_1  | 2020-11-30 12:10:59.128 [info] <0.411.0> Enabling free disk space monitoring
rabbitmq3_1  | 2020-11-30 12:10:59.128 [info] <0.411.0> Disk free limit set to 50MB
rabbitmq3_1  | 2020-11-30 12:10:59.132 [info] <0.272.0> Running boot step code_server_cache defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.132 [info] <0.272.0> Running boot step file_handle_cache defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.133 [info] <0.414.0> Limiting to approx 1048479 file handles (943629 sockets)
rabbitmq3_1  | 2020-11-30 12:10:59.133 [info] <0.415.0> FHC read buffering:  OFF
rabbitmq3_1  | 2020-11-30 12:10:59.133 [info] <0.415.0> FHC write buffering: ON
rabbitmq3_1  | 2020-11-30 12:10:59.134 [info] <0.272.0> Running boot step worker_pool defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.134 [info] <0.370.0> Will use 8 processes for default worker pool
rabbitmq3_1  | 2020-11-30 12:10:59.134 [info] <0.370.0> Starting worker pool 'worker_pool' with 8 processes in it
rabbitmq3_1  | 2020-11-30 12:10:59.135 [info] <0.272.0> Running boot step database defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.137 [info] <0.272.0> Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq3_1  | 2020-11-30 12:10:59.143 [info] <0.272.0> Successfully synced tables from a peer
rabbitmq3_1  | 2020-11-30 12:10:59.143 [info] <0.272.0> Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq3_1  | 2020-11-30 12:10:59.143 [info] <0.272.0> Successfully synced tables from a peer
rabbitmq3_1  | 2020-11-30 12:10:59.173 [info] <0.272.0> Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq3_1  | 2020-11-30 12:10:59.173 [info] <0.272.0> Successfully synced tables from a peer
rabbitmq3_1  | 2020-11-30 12:10:59.173 [info] <0.272.0> Peer discovery backend rabbit_peer_discovery_classic_config does not support registration, skipping registration.
rabbitmq3_1  | 2020-11-30 12:10:59.173 [info] <0.272.0> Running boot step database_sync defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.173 [info] <0.272.0> Running boot step feature_flags defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step codec_correctness_check defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step external_infrastructure defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step rabbit_registry defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step rabbit_auth_mechanism_cr_demo defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step rabbit_queue_location_random defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.174 [info] <0.272.0> Running boot step rabbit_event defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.175 [info] <0.272.0> Running boot step rabbit_auth_mechanism_amqplain defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.175 [info] <0.272.0> Running boot step rabbit_auth_mechanism_plain defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.175 [info] <0.272.0> Running boot step rabbit_exchange_type_direct defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.176 [info] <0.272.0> Running boot step rabbit_exchange_type_fanout defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.176 [info] <0.272.0> Running boot step rabbit_exchange_type_headers defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.176 [info] <0.272.0> Running boot step rabbit_exchange_type_topic defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.177 [info] <0.272.0> Running boot step rabbit_mirror_queue_mode_all defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.177 [info] <0.272.0> Running boot step rabbit_mirror_queue_mode_exactly defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.177 [info] <0.272.0> Running boot step rabbit_mirror_queue_mode_nodes defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.178 [info] <0.272.0> Running boot step rabbit_priority_queue defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.178 [info] <0.272.0> Priority queues enabled, real BQ is rabbit_variable_queue
rabbitmq3_1  | 2020-11-30 12:10:59.178 [info] <0.272.0> Running boot step rabbit_queue_location_client_local defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.178 [info] <0.272.0> Running boot step rabbit_queue_location_min_masters defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.179 [info] <0.272.0> Running boot step kernel_ready defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.179 [info] <0.272.0> Running boot step rabbit_sysmon_minder defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.179 [info] <0.272.0> Running boot step rabbit_epmd_monitor defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.180 [info] <0.441.0> epmd monitor knows us, inter-node communication (distribution) port: 25672
rabbitmq3_1  | 2020-11-30 12:10:59.181 [info] <0.272.0> Running boot step guid_generator defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.187 [info] <0.272.0> Running boot step rabbit_node_monitor defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.187 [info] <0.445.0> Starting rabbit_node_monitor
rabbitmq3_1  | 2020-11-30 12:10:59.187 [info] <0.272.0> Running boot step delegate_sup defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.189 [info] <0.272.0> Running boot step rabbit_memory_monitor defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.189 [info] <0.272.0> Running boot step core_initialized defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.189 [info] <0.272.0> Running boot step upgrade_queues defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.213 [info] <0.272.0> Running boot step rabbit_connection_tracking defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.214 [info] <0.272.0> Running boot step rabbit_connection_tracking_handler defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.214 [info] <0.272.0> Running boot step rabbit_exchange_parameters defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.214 [info] <0.272.0> Running boot step rabbit_mirror_queue_misc defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.215 [info] <0.272.0> Running boot step rabbit_policies defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.217 [info] <0.272.0> Running boot step rabbit_policy defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.217 [info] <0.272.0> Running boot step rabbit_queue_location_validator defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.217 [info] <0.272.0> Running boot step rabbit_quorum_memory_manager defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.217 [info] <0.272.0> Running boot step rabbit_vhost_limit defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.217 [info] <0.272.0> Running boot step recovery defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.219 [info] <0.474.0> Making sure data directory '/var/lib/rabbitmq/mnesia/rabbit@f1f2ad88a3fe/msg_stores/vhosts/628WB79CIFDYO9LJI6DKMI09L' for vhost '/' exists
rabbitmq3_1  | 2020-11-30 12:10:59.229 [info] <0.474.0> Starting message stores for vhost '/'
rabbitmq3_1  | 2020-11-30 12:10:59.230 [info] <0.478.0> Message store "628WB79CIFDYO9LJI6DKMI09L/msg_store_transient": using rabbit_msg_store_ets_index to provide index
rabbitmq3_1  | 2020-11-30 12:10:59.232 [info] <0.474.0> Started message store of type transient for vhost '/'
rabbitmq3_1  | 2020-11-30 12:10:59.232 [info] <0.482.0> Message store "628WB79CIFDYO9LJI6DKMI09L/msg_store_persistent": using rabbit_msg_store_ets_index to provide index
rabbitmq3_1  | 2020-11-30 12:10:59.236 [info] <0.474.0> Started message store of type persistent for vhost '/'
rabbitmq3_1  | 2020-11-30 12:10:59.241 [info] <0.272.0> Running boot step empty_db_check defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.241 [info] <0.272.0> Will not seed default virtual host and user: have definitions to load...
rabbitmq3_1  | 2020-11-30 12:10:59.241 [info] <0.272.0> Running boot step rabbit_looking_glass defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.241 [info] <0.272.0> Running boot step rabbit_core_metrics_gc defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.242 [info] <0.272.0> Running boot step background_gc defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.242 [info] <0.272.0> Running boot step connection_tracking defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.242 [info] <0.272.0> Setting up a table for connection tracking on this node: tracked_connection_on_node_rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Setting up a table for per-vhost connection counting on this node: tracked_connection_per_vhost_on_node_rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Running boot step routing_ready defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Running boot step pre_flight defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Running boot step notify_cluster defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Running boot step networking defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.272.0> Running boot step definition_import_worker_pool defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.243 [info] <0.370.0> Starting worker pool 'definition_import_pool' with 8 processes in it
rabbitmq3_1  | 2020-11-30 12:10:59.244 [info] <0.272.0> Running boot step cluster_name defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.244 [info] <0.272.0> Running boot step direct_client defined by app rabbit
rabbitmq3_1  | 2020-11-30 12:10:59.245 [info] <0.44.0> Application rabbit started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags: list of feature flags found:
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [ ] drop_unroutable_metric
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [ ] empty_basic_get_metric
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [x] implicit_default_bindings
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [x] maintenance_mode_status
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [x] quorum_queue
rabbitmq3_1  | 2020-11-30 12:10:59.858 [info] <0.516.0> Feature flags:   [x] virtual_host_metadata
rabbitmq3_1  | 2020-11-30 12:10:59.859 [info] <0.516.0> Feature flags: feature flag states written to disk: yes
rabbitmq3_1  | 2020-11-30 12:11:00.214 [info] <0.516.0> Running boot step rabbit_mgmt_db_handler defined by app rabbitmq_management_agent
rabbitmq3_1  | 2020-11-30 12:11:00.214 [info] <0.516.0> Management plugin: using rates mode 'basic'
rabbitmq3_1  | 2020-11-30 12:11:00.221 [info] <0.44.0> Application rabbitmq_management_agent started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.247 [info] <0.44.0> Application cowlib started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.274 [info] <0.44.0> Application cowboy started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.301 [info] <0.44.0> Application rabbitmq_web_dispatch started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.326 [info] <0.44.0> Application amqp_client started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.351 [info] <0.516.0> Running boot step rabbit_mgmt_reset_handler defined by app rabbitmq_management
rabbitmq3_1  | 2020-11-30 12:11:00.351 [info] <0.516.0> Running boot step rabbit_management_load_definitions defined by app rabbitmq_management
rabbitmq3_1  | 2020-11-30 12:11:00.410 [info] <0.582.0> Management plugin: HTTP (non-TLS) listener started on port 15672
rabbitmq3_1  | 2020-11-30 12:11:00.410 [info] <0.688.0> Statistics database started.
rabbitmq3_1  | 2020-11-30 12:11:00.410 [info] <0.687.0> Starting worker pool 'management_worker_pool' with 3 processes in it
rabbitmq3_1  | 2020-11-30 12:11:00.411 [info] <0.44.0> Application rabbitmq_management started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.499 [info] <0.44.0> Application prometheus started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.534 [info] <0.701.0> Prometheus metrics: HTTP (non-TLS) listener started on port 15692
rabbitmq3_1  | 2020-11-30 12:11:00.535 [info] <0.516.0> Ready to start client connection listeners
rabbitmq3_1  | 2020-11-30 12:11:00.535 [info] <0.44.0> Application rabbitmq_prometheus started on node rabbit@f1f2ad88a3fe
rabbitmq3_1  | 2020-11-30 12:11:00.540 [info] <0.820.0> started TCP listener on 0.0.0.0:5672
rabbitmq3_1  | 2020-11-30 12:11:00.777 [info] <0.516.0> Server startup complete; 4 plugins started.
rabbitmq3_1  |  * rabbitmq_prometheus
rabbitmq3_1  |  * rabbitmq_management
rabbitmq3_1  |  * rabbitmq_web_dispatch
rabbitmq3_1  |  * rabbitmq_management_agent
rabbitmq3_1  |  completed with 4 plugins.
rabbitmq3_1  | 2020-11-30 12:11:00.778 [info] <0.516.0> Resetting node maintenance status
```

Run and execute with unit tests.

```sh
$ mvn clean install
```
Expected Output
```sh
mvn clean install
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.iq.business.producer:rabbitmq-producer-com.iq.business.service:jar:1.1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-resources-plugin is missing. @ line 95, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] iq-business                                                        [pom]
[INFO] rabbitmq-producer-com.iq.business.service                          [jar]
[INFO] rabbitmq-consumer-com.iq.business.service                          [jar]
[INFO] 
[INFO] --------------------< com.iq.business:iq-business >---------------------
[INFO] Building iq-business 1.1.0-SNAPSHOT                                [1/3]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ iq-business ---
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ iq-business ---
[INFO] Installing /home/renaldo/Projects/tutorials/personal_github/iqbusiness/pom.xml to /home/renaldo/.m2/repository/com/iq/business/iq-business/1.1.0-SNAPSHOT/iq-business-1.1.0-SNAPSHOT.pom
[INFO] 
[INFO] --< com.iq.business.producer:rabbitmq-producer-com.iq.business.service >--
[INFO] Building rabbitmq-producer-com.iq.business.service 1.1.0-SNAPSHOT  [2/3]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Deleting /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ rabbitmq-producer-com.iq.business.service ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 5 source files to /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ rabbitmq-producer-com.iq.business.service ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Surefire report directory: /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target/surefire-reports
[INFO] Using configured provider org.apache.maven.surefire.junitcore.JUnitCoreProvider
[INFO] parallel='none', perCoreThreadCount=true, threadCount=0, useUnlimitedThreads=false, threadCountSuites=0, threadCountClasses=0, threadCountMethods=0, parallelOptimized=true

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.iq.business.service.MessageSenderTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 sec - in com.iq.business.service.MessageSenderTest

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:3.1.0:jar (default-jar) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Building jar: /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target/rabbitmq-producer-service.jar
[INFO] 
[INFO] --- maven-resources-plugin:2.6:copy-resources (copy-jar-file-for-docker) @ rabbitmq-producer-com.iq.business.service ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ rabbitmq-producer-com.iq.business.service ---
[INFO] Installing /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/target/rabbitmq-producer-service.jar to /home/renaldo/.m2/repository/com/iq/business/producer/rabbitmq-producer-com.iq.business.service/1.1.0-SNAPSHOT/rabbitmq-producer-com.iq.business.service-1.1.0-SNAPSHOT.jar
[INFO] Installing /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-producer-service/pom.xml to /home/renaldo/.m2/repository/com/iq/business/producer/rabbitmq-producer-com.iq.business.service/1.1.0-SNAPSHOT/rabbitmq-producer-com.iq.business.service-1.1.0-SNAPSHOT.pom
[INFO] 
[INFO] --< com.iq.business.consumer:rabbitmq-consumer-com.iq.business.service >--
[INFO] Building rabbitmq-consumer-com.iq.business.service 1.1.0-SNAPSHOT  [3/3]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Deleting /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ rabbitmq-consumer-com.iq.business.service ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 6 source files to /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ rabbitmq-consumer-com.iq.business.service ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Surefire report directory: /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target/surefire-reports
[INFO] Using configured provider org.apache.maven.surefire.junitcore.JUnitCoreProvider
[INFO] parallel='none', perCoreThreadCount=true, threadCount=0, useUnlimitedThreads=false, threadCountSuites=0, threadCountClasses=0, threadCountMethods=0, parallelOptimized=true

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.iq.business.util.MessageUtilTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.023 sec - in com.iq.business.util.MessageUtilTest
Running com.iq.business.service.MessageReceiverTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.117 sec - in com.iq.business.service.MessageReceiverTest

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:3.1.0:jar (default-jar) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Building jar: /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target/rabbitmq-consumer-com.iq.business.service-1.1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ rabbitmq-consumer-com.iq.business.service ---
[INFO] Installing /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/target/rabbitmq-consumer-com.iq.business.service-1.1.0-SNAPSHOT.jar to /home/renaldo/.m2/repository/com/iq/business/consumer/rabbitmq-consumer-com.iq.business.service/1.1.0-SNAPSHOT/rabbitmq-consumer-com.iq.business.service-1.1.0-SNAPSHOT.jar
[INFO] Installing /home/renaldo/Projects/tutorials/personal_github/iqbusiness/rabbitmq-consumer-service/pom.xml to /home/renaldo/.m2/repository/com/iq/business/consumer/rabbitmq-consumer-com.iq.business.service/1.1.0-SNAPSHOT/rabbitmq-consumer-com.iq.business.service-1.1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iq-business 1.1.0-SNAPSHOT:
[INFO] 
[INFO] iq-business ........................................ SUCCESS [  0.458 s]
[INFO] rabbitmq-producer-com.iq.business.service .......... SUCCESS [  4.971 s]
[INFO] rabbitmq-consumer-com.iq.business.service .......... SUCCESS [  2.313 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.924 s
[INFO] Finished at: 2020-11-30T13:58:46+02:00
[INFO] ------------------------------------------------------------------------

```

Run and executing ignoring unit tests.

```sh
$ mvn clean install -DskipTests=true
```

### Access the Applications
```sh
Start Receiver.java via IDE
Start Sender.java via IDE
```

### Docker

By default, the Docker will expose port 8080, this can be changed when running image as shown below:
Producer:
```sh
$ cd rabbitmq-producer-service/src/main/docker
$ docker build -t rabbitmq/producer .
$ docker run -p 8080:8080 -it rabbitmq/producer:latest
Note this is failing with connectionFactory while when connecting to RabbitMQ inside the container.
```
Consumer:
```sh
$ cd rabbitmq-consumer-service/src/main/docker
$ docker build -t rabbitmq/consumer .
$ docker run -p 8081:8081 -it rabbitmq/consumer:latest
Note this is failing with connectionFactory while when connecting to RabbitMQ inside the container.
```