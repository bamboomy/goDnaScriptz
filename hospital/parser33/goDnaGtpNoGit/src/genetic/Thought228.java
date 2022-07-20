package genetic;
import java.util.ArrayList;
class Thought228 extends Thought{
private static ArrayList<Thought228> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 740.4116054723127;
private double fd1 = 356.399778575099;
private Thought fo0 = null;
private Thought fo1 = null;
Thought228 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought228 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought228 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought228 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought228 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought228 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought228 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought228 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought228 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought228 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought228 instance = new Thought228 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought383.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought105.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought297.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    double ld0 = 725.0688978246479;
    ab4 = !fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought96.getInstance();
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought344.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
    fd0 = fd1 + ad1;
    lb1 = fb0 || fb1;
    Output.points[1][2] -= ad2;
    boolean lb3 = true;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb1, lb3, fb0, fb1);
}
    lb1 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, fb0);
}
    if (fb1) {
        lb1 = ad2 > ad3;
        if (lb3) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fb0 = fb1 || lb1;
            lb3 = ad4 < fd0;
            fb0 = fd1 < ad1;
if(fo0 != null){
              ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
}}
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    double ld1 = 903.0308012625202;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld1;
    if (ab1) {
        ad1 = ad2 - ad3;
        Output.points[1][3] -= ad4;
        boolean lb2 = true;
        ab1 = ab2 || ab3;
        ab4 = fd0 > fd1;
if(fo0 != null){
          fo0.m1(fb0, fb1, lb2, lb0);
}
        boolean lb3 = false;
        } else if (ab2) {
        ld1 = ad1 + ad2;
        for(int i0=0; i0<10; i0++){
            ad3 *= -1;
            ad4 *= -1;
            ab3 = ab4 && fb0;
            fb1 = fd0 > fd1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
            Thought lo4 = Thought135.getInstance(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
            ad1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
            }
        boolean lb5 = true;
        ab4 = !fb0;
        boolean lb6 = false;
        } else {
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld0 = 266.0046003643255;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fb0 = ao2.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        boolean lb2 = false;
        fd0 *= -1;
        lb2 = fb0 && fb1;
        double ld3 = 597.4281254629178;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought153.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad1 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld1 = 109.06214796762177;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought84.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo3 = Thought205.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought397.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);

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
    for(int i0=0; i0<10; i0++){
        if (ab1) {
            if (ab2) {
                ab3 = !ab4;
                Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
                boolean lb1 = true;
                fd1 = fd0 - fd1;
                ab2 = ab3 || ab4;
                Thought lo2 = Thought352.getInstance(fo0, fo1, ao1, ao2);
                double ld3 = 851.3889263344266;
                fb0 = fb1 && lb1;
if(ao4 != null){
                  ao3 = ao4.m4(ld3, fd0, fd1, ld3);
}
}}}
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
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought120.getInstance();
if(fo1 != null){
      ad3 = fo1.m3(ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought126.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
    boolean lb3 = false;
    Output.points[1][4] -= ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    Thought lo5 = Thought0.getInstance(fo1, ao1, ao2, ao3);
    Thought lo6 = Thought392.getInstance(ad4, fd0, fd1, ad1);
    boolean lb7 = false;

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb1 = fd1 < fd0;
        Output.points[1][5] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought159.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought285.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought359.getInstance();
    fd1 = fd0 - fd1;
    Output.points[1][6] += fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought338.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        boolean lb4 = false;
        Thought lo5 = Thought353.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought253.getInstance();
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought370.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][7] += ad3;
    Thought lo2 = Thought256.getInstance(ad4, fd0, fd1, ad1);
    boolean lb3 = true;
    fb0 = !fb1;
    boolean lb4 = false;
    double ld5 = 23.4836109422237;
    lb3 = ad1 > ad2;

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    Thought lo0 = Thought396.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought378.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 - ad3;
    ab3 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
        ab3 = ad2 < ad3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}

Thought.STACK_COUNTER++;
return ab2;
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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 130.8953896966931;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
    fb0 = fd1 > ld0;
    fd0 = fd1 + ld0;
    double ld2 = 726.2606586533234;
    fb1 = lb1 && fb0;
    Output.points[1][8] -= ld2;
    Thought lo3 = Thought29.getInstance();
if(ao1 != null){
      fb1 = ao1.m2(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    ld2 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    fd0 *= -1;
    Output.points[2][0] -= fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    boolean lb0 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][1] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    ab1 = !ab2;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > fd0;
    fb0 = fb1 && lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    fb0 = !fb1;
    Thought lo2 = Thought374.getInstance();
if(ao2 != null){
      ao2.m3(lb0, lb1, ab1, ab2);
}
    ad2 *= -1;

Thought.STACK_COUNTER++;
return ab3;
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 780.2585565156835;
    Thought lo1 = Thought274.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    Output.points[2][2] += fd1;
    double ld4 = 306.7413404415943;
    boolean lb5 = true;
    Thought lo6 = Thought60.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, lb5, fb0);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb7 = false;
        Output.points[2][3] -= ld0;
if(fo0 != null){
          fo0.m1(ld4, fd0, fd1, ld0);
}
        lb7 = lb2 && lb3;
if(fo1 != null){
          ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4);
}
        double ld8 = 782.6645891855152;
        double ld9 = 137.81979010901313;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(lb5, fb0, fb1, lb7);
}
        ld0 = ld4 - fd0;
        lb2 = !lb3;
        lb5 = !fb0;
        fd1 = ld8 + ld9;
        ld0 = ld4 + fd0;
        Thought lo10 = Thought325.getInstance(fo0, fo1, fo0, fo1, fd1, ld8, ld9, ld0, fb1, lb7, lb2, lb3);
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
    ab2 = ab3 && ab4;
    if (fb0) {
        fb1 = fd0 > fd1;
        ab1 = fd0 < fd1;
        ab2 = !ab3;
if(fo0 != null){
          ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Output.points[2][4] += fd0;
        ab1 = ab2 && ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
        ab1 = fd1 < fd0;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought246.getInstance(fd0, fd1, fd0, fd1);
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
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
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld0 = 52.83266214953342;
    boolean lb1 = true;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    Output.points[2][5] += ad4;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo0.m3(fd1, ld0, ad1, ad2);
}
    fb1 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      lb1 = fo0.m2();
}
    double ld2 = 770.7732231951546;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(ld0, ld2, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    lb1 = lb3 && fb0;
    fb1 = lb1 && lb3;
    fb0 = fb1 || lb1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ad4;
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
    double ld0 = 125.28461762846801;
    ab2 = ab3 || ab4;
    ld0 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    double ld1 = 121.99074718517808;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought134.getInstance(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    fb0 = ld0 > ld1;
    double ld3 = 78.85449695212783;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ld3;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(ao1 != null){
          ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    ad3 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought198.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[2][6] -= fd1;
    fb1 = fb0 || fb1;
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ad4;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
if(ao3 != null){
      fd0 = ao3.m3();
}
    double ld2 = 104.10187032586326;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld3 = 691.526877008029;
    Thought lo4 = Thought317.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld2, fb1, lb0, lb1, ab1);
    ab2 = ab3 && ab4;
    Output.points[2][7] -= ld3;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, ld3, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld2;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4);
}

Thought.STACK_COUNTER++;
return fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 160.65867496182034;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    double ld1 = 44.37761825100454;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      lb3 = ao2.m2();
}
    boolean lb4 = false;
    lb4 = ad4 > fd0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought14.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Thought lo2 = Thought118.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo2 = Thought396.getInstance();
    boolean lb3 = false;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Output.points[2][8] -= ad4;
    Thought lo1 = Thought124.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    Output.points[3][0] -= ad3;
    lb0 = ad4 > fd0;
    Output.points[3][1] -= fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 940.9161519123065;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought345.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
    double ld3 = 410.5304595971006;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    double ld4 = 455.2113681623722;
    Thought lo5 = Thought371.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    Thought lo6 = Thought54.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(ld3, ld4, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld0 = ld3 + ld4;
    Thought lo7 = Thought220.getInstance();
if(fo1 != null){
      ad1 = fo1.m3(fb1, lb1, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] += fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][3] -= fd0;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
    Thought lo1 = Thought93.getInstance(fb1, lb0, fb0, fb1);
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb3 = false;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao4;
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
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = !lb0;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    double ld1 = 24.368392272000335;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    ad1 *= -1;
    lb0 = ad2 > ad3;
    Output.points[3][4] += ad4;
    fb0 = fd0 < fd1;
    ld1 = ad1 - ad2;
    ad3 *= -1;
    fb1 = !lb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[3][5] += fd0;
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought138.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    Output.points[3][6] += fd1;
    Output.points[3][7] -= fd0;
    double ld2 = 891.3441085513654;
    Thought lo3 = Thought134.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    ld2 = fd0 + fd1;
    double ld4 = 320.65479623053886;
        Thought lo5 = Thought131.getInstance(ab4, fb0, fb1, lb1);
    double ld6 = 595.6019939311145;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        Thought lo0 = Thought79.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ab3 = fd1 > ad1;
    double ld1 = 472.5832611952674;
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
    fb1 = !lb2;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb2);
}
    ab1 = ad3 < ad4;
    fd0 = fd1 - ld1;
    ab2 = ad1 > ad2;
    if (ab3) {
        double ld3 = 727.3694361639429;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
        Thought lo4 = Thought86.getInstance(ao3, ao4, fo0, fo1);
        ad2 = ad3 - ad4;
}
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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought266.getInstance();
    Output.points[3][8] -= fd1;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    Thought lo2 = Thought322.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    Output.points[4][0] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought15.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    boolean lb4 = false;
    fd1 = fd0 - fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb0 = !fb1;
    Thought lo0 = Thought221.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld1 = 902.0695929180274;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    Output.points[4][1] -= fd0;
    Output.points[4][2] += fd1;
    ld1 *= -1;

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
    double ld0 = 626.6462267082369;
    double ld1 = 408.5239878491266;
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
    fb0 = ld1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !fb0;
    ld0 *= -1;
    ld1 = fd0 - fd1;
    ld0 = ld1 - fd0;
    fd1 = ld0 - ld1;
    Output.points[4][3] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[4][4] -= ld1;
        Thought lo2 = Thought80.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought227.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought132.getInstance(fd0, fd1, ld0, ld1);

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
