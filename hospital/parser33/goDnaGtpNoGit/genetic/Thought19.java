package genetic;
import java.util.ArrayList;
class Thought19 extends Thought{
private static ArrayList<Thought19> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 9.652599709223093;
private double fd1 = 315.9271884469163;
private Thought fo0 = null;
private Thought fo1 = null;
Thought19 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought19 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought19 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 947.2253357427138;
    fb0 = fb1 && lb0;
    Output.points[4][1] += fd0;
if(fo1 != null){
          fb0 = fo1.m2();
}
    boolean lb2 = false;
    Thought lo3 = Thought174.getInstance(fb0, fb1, lb0, lb2);
    fb0 = fb1 && lb0;
        Output.points[4][2] += fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
        fd0 *= -1;
        boolean lb4 = false;
        lb4 = !lb0;
        fd1 *= -1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld5 = 625.4247822054828;
        double ld6 = 472.45510591918713;
        ld6 *= -1;
        double ld7 = 911.6575961716047;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    Output.points[4][3] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = true;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought216.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought189.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    Thought lo3 = Thought42.getInstance();
    fd0 = fd1 + fd0;
    fb1 = lb0 && ab1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
        fb0 = !fb1;
    ad2 = ad3 + ad4;
    Output.points[4][4] += fd0;
    Output.points[4][5] -= fd1;
        lb0 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
    lb0 = ad1 < ad2;
    fb0 = fb1 && lb0;
    double ld1 = 718.5450781983068;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[4][6] += ld1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought164.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought370.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Thought lo1 = Thought383.getInstance();
    double ld2 = 834.4075913724281;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought264.getInstance(fd1, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
    ld2 = fd0 + fd1;
    fb0 = ld2 > fd0;
    fd1 = ld2 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb3, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld2);
}
    fd0 = fd1 - ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
    lb3 = fb0 || fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought339.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld1 = 884.8876190218674;
    double ld2 = 883.9554497510296;
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
    Output.points[4][7] += ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2);
}
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
        ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought46.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[4][8] += fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[5][0] -= fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 *= -1;
    Thought lo3 = Thought25.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4();
}
    ad2 *= -1;
    Output.points[5][1] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought197.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    double ld1 = 127.95038776087426;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1);
}
    ld1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 457.17952056428;
    fb1 = fb0 && fb1;
    double ld1 = 115.24406250536268;
    Thought lo2 = Thought300.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ld0 < ld1;
if(fo1 != null){
      fd0 = fo1.m3(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    Thought lo5 = Thought148.getInstance(ld0, ld1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    lb4 = !fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
if(fo0 != null){
              fo1 = fo0.m4(lb3, lb4, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[5][2] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought354.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
    double ld2 = 556.8180094071453;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    Output.points[5][3] -= ad4;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    double ld0 = 34.2520424806382;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
        Thought lo2 = Thought321.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        fd1 *= -1;
}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        if (fb0) {
            fb1 = fd0 < fd1;
if(ao3 != null){
              ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
            fb0 = fb1 && fb0;
            double ld0 = 96.97345397553651;
            Output.points[5][4] += ld0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
              fd1 = ao4.m3();
}
            Output.points[5][5] -= ld0;
            } else if (fb1) {
            for(int i0=0; i0<10; i0++){
if(fo1 != null){
                  fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
                fb0 = fd1 > fd0;
if(ao1 != null){
                  ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
                fb1 = fd1 < fd0;
                Thought lo1 = Thought234.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
                  fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
                  fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
                fd1 *= -1;
                fd0 = fd1 + fd0;
                boolean lb2 = false;
if(fo1 != null){
                  fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
                for(int i1=0; i1<10; i1++){
                    Output.points[5][6] += fd1;
                    fd0 = fd1 - fd0;
}}}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao1 = ao2.m4();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought8.getInstance(fb0, fb1, fb0, fb1);
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    double ld0 = 19.91735838996925;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    Thought lo2 = Thought349.getInstance();
    ab3 = ab4 || fb0;
    Thought lo3 = Thought293.getInstance(fb1, lb1, ab1, ab2);
    boolean lb4 = true;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    Thought lo5 = Thought16.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    Output.points[5][7] -= ld0;
    double ld6 = 569.0926229239401;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[5][8] -= fd1;
    fb1 = !lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    lb0 = !ab1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad4 *= -1;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought138.getInstance(fd0, fd1, ad1, ad2);
    double ld2 = 830.6484780794491;
    boolean lb3 = false;
        Thought lo4 = Thought305.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld2 + ad1;
    fb0 = !fb1;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 762.4340652887344;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
        fd1 = ld0 - fd0;
        Thought lo2 = Thought172.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
        boolean lb4 = false;
        Thought lo5 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
        }

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought295.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 *= -1;
    Output.points[6][0] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought64.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 723.5752498959048;
    fb1 = fb0 || fb1;
    double ld1 = 846.1521035045411;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
    Thought lo2 = Thought195.getInstance();
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        ld0 = ld1 + ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ld1, ad1);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought172.getInstance();
    fb1 = fb0 || fb1;
    double ld4 = 334.04559479935114;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb5 = false;
    lb5 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld4, ad1, ad2, lb5, fb0, fb1, lb5);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb6, fb0, fb1, lb5);
}

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[6][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought23.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    double ld1 = 857.425726069142;
    Output.points[6][2] += fd0;
    Thought lo2 = Thought90.getInstance(fo1, ao1, ao2, ao3);
    fd1 = ld1 - fd0;
    fd1 *= -1;
    Thought lo3 = Thought71.getInstance(ld1, fd0, fd1, ld1);
    fb0 = !fb1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    double ld0 = 996.7092314388206;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
        double ld1 = 941.938791531664;
    fd0 = fd1 + ld0;
    ld1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3();
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    lb0 = ab1 || ab2;
        Thought lo1 = Thought259.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought272.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    lb3 = ab1 || ab2;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = lb3 && ab1;
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = false;
    Output.points[6][3] += fd1;
if(ao3 != null){
      fd0 = ao3.m3(lb3, lb4, ab1, ab2);
}
    double ld5 = 987.3593391029615;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld5, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld5, fd0, fd1, lb3, lb4, ab1, ab2);
}
    Thought lo6 = Thought321.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    ab1 = !ab2;
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(lb0, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
          ad4 = ao4.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        lb0 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || ab1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        } else if (ab2) {
        } else if (ab3) {
        ab4 = fb0 && fb1;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[6][4] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld1 = 156.02477185096205;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < ld1;
    if (lb0) {
        Thought lo2 = Thought20.getInstance(fd0, fd1, ld1, fd0);
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 + fd1;
        fb0 = fb1 || lb0;
        fb0 = ld1 > fd0;
        Output.points[6][5] += fd1;
if(fo0 != null){
          fb1 = fo0.m2();
}
        lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
        lb0 = ld1 > fd0;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        } else if (ab3) {
        Output.points[6][6] -= fd0;
        double ld0 = 114.27681290565324;
        ab4 = fb0 && fb1;
        Thought lo1 = Thought115.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m1(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
        ab1 = !ab2;
        ab3 = !ab4;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3();
}
    ad2 *= -1;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought301.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    fb0 = ad3 < ad4;
    Thought lo3 = Thought347.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, lb2, fb0);
    fb1 = lb0 || lb2;
    double ld4 = 553.6995938971338;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    double ld5 = 730.1817412246431;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld6 = 852.1236567003199;
    double ld7 = 256.5089771873352;
    ld6 = ld7 - ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = !ab1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    ab2 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought159.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 854.3100203281606;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld2 = 38.298828039640604;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, ld2);
}
    Thought lo3 = Thought82.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2);
if(ao4 != null){
      fb0 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought395.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2, fb1, fb0, fb1, fb0);
    Output.points[6][7] += fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb5 = true;
    boolean lb6 = true;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb6, fb0, fb1, lb5);
}
    lb6 = fb0 && fb1;
    Thought lo7 = Thought1.getInstance(fo1, ao1, ao2, ao3);
    double ld8 = 849.618549961944;
    lb5 = ld1 < ld2;
    ld8 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld2);
}
    boolean lb9 = true;
if(fo1 != null){
      lb6 = fo1.m2(ao1, ao2, ao3, ao4, ld8, fd0, fd1, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3();
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought216.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    double ld2 = 313.93315567078355;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
}
    ad2 *= -1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought364.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        Thought lo1 = Thought315.getInstance();
        fd0 = fd1 - fd0;
        Output.points[6][8] -= fd1;
        Thought lo2 = Thought296.getInstance(ab4, fb0, fb1, ab1);
        Thought lo3 = Thought141.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
}}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
    double ld0 = 100.34198652271351;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ld0 *= -1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    double ld0 = 94.63443551651916;
    Output.points[7][0] += fd0;
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fd1 > ld0;
    fb1 = fd0 > fd1;
    boolean lb2 = true;
    lb1 = ld0 > fd0;
    lb2 = fd1 < ld0;
    fb0 = fb1 || lb1;
    lb2 = fd0 < fd1;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought354.getInstance(lb3, lb4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, lb2, lb3, lb4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought381.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought121.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought119.getInstance();
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    Output.points[7][1] -= fd0;
    lb2 = fd1 > fd0;
    fb0 = fd1 < fd0;
    Thought lo4 = Thought352.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought380.getInstance(fd1, fd0, fd1, fd0);
    Thought lo6 = Thought362.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Output.points[7][2] += fd1;
    fb1 = lb2 && fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 945.5101828958983;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
