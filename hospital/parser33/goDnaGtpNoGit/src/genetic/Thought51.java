package genetic;
import java.util.ArrayList;
class Thought51 extends Thought{
private static ArrayList<Thought51> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 519.5748168358009;
private double fd1 = 910.3019645698196;
private Thought fo0 = null;
private Thought fo1 = null;
Thought51 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought51 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought51 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought51 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought51 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought51 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought51 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought51 instance = new Thought51 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
    if (fb0) {
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
        double ld0 = 844.456552786942;
        boolean lb1 = true;
        lb1 = ld0 < fd0;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
        Thought lo2 = Thought338.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
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
    Output.points[8][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    double ld1 = 336.71409007993367;
    boolean lb2 = false;
    ld1 *= -1;
        fd0 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
    boolean lb4 = false;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
        ab2 = ld1 < fd0;
    ab3 = fd1 < ld1;
    Output.points[8][8] += fd0;
    Output.points[0][0] += fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ld1 = fd0 - fd1;
    boolean lb5 = true;

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
    fb1 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    Output.points[0][1] += ad1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
    boolean lb1 = false;
    double ld2 = 69.06883171071213;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb0 = !lb1;
    Output.points[0][2] += fd1;
    ld2 *= -1;
    double ld3 = 463.10179674911683;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld4 = 661.4981733807813;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    double ld2 = 137.27122018578748;
    ld2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        fb1 = ld2 < fd0;
        lb0 = fd1 < ld2;
        lb1 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ld2 *= -1;
        fb0 = fb1 || lb0;
if(ao2 != null){
          ao2.m2(fd0, fd1, ld2, fd0);
}
        double ld3 = 594.5618598076396;
        lb1 = fd0 < fd1;
        boolean lb4 = false;
        ld3 = ld2 - fd0;
        fd1 = ld3 - ld2;
        lb1 = fb0 || fb1;
        boolean lb5 = true;
        lb4 = !lb5;
        lb0 = fd0 > fd1;
if(ao3 != null){
          ld3 = ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld3);
}
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 418.51143890273534;
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 < ld0;
if(ao4 != null){
          fb1 = ao4.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought307.getInstance(fo0, fo1, ao1, ao2, lb2, lb3, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
    lb1 = ad1 > ad2;
    Output.points[0][3] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(lb2, lb3, fb0, fb1);
}
    ad4 = fd0 - fd1;

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
    ab1 = fd0 > fd1;
    Thought lo0 = Thought279.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought277.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought369.getInstance();
if(ao4 != null){
      fd1 = ao4.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    Thought lo3 = Thought44.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + fd0;
    ab1 = !ab2;
        for(int i0=0; i0<10; i0++){
        double ld4 = 429.4956468273539;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 544.7057535691522;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought386.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        double ld3 = 680.0079105546838;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
        ad2 *= -1;
        double ld5 = 496.1754457913858;
        Output.points[0][4] -= ad2;
        }
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ld0 < ad1;
    Thought lo6 = Thought126.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    Thought lo7 = Thought187.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1);
    ad2 = ad3 - ad4;

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
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    double ld0 = 727.4470422592739;
    fb0 = ld0 < fd0;
    if (fb1) {
        } else if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
}
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
    double ld0 = 514.6468851188976;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = fd1 > ld0;
    Thought lo1 = Thought155.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    Output.points[0][5] -= fd1;
    boolean lb2 = true;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought90.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb4 = false;
    Thought lo5 = Thought280.getInstance();
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ab4;
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
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo1 = Thought256.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    ad3 = ad4 - fd0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought398.getInstance();
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[0][6] -= fd1;
    fb1 = !lb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought99.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    boolean lb1 = true;
    boolean lb2 = false;
    ab2 = ad2 > ad3;
    ab3 = ab4 && fb0;
    fb1 = lb1 || lb2;
    boolean lb3 = true;
    lb3 = ad4 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= fd1;
    Output.points[0][8] += fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;

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
    fb1 = ad1 > ad2;
    Output.points[1][0] += ad3;
    boolean lb0 = false;
    Thought lo1 = Thought366.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    fb0 = ad2 > ad3;
    Thought lo2 = Thought347.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
    lb0 = ad2 < ad3;
    Thought lo3 = Thought51.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    Thought lo4 = Thought348.getInstance(ao3, ao4, fo0, fo1);
    ad4 *= -1;
    Output.points[1][1] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    lb0 = fb0 || fb1;
    fd1 = ad1 - ad2;
    lb0 = ad3 > ad4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Output.points[1][2] -= ad3;
    lb0 = ad4 > fd0;
    fb0 = fb1 || lb0;
    Thought lo5 = Thought83.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    double ld6 = 231.73212549829492;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought106.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo1 = Thought44.getInstance();
    boolean lb2 = false;
    lb2 = ab1 || ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo3 = Thought14.getInstance(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb2);
}
    Output.points[1][4] += fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
        double ld0 = 75.13370845895926;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            }
        ab4 = fb0 && fb1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    Thought lo0 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    Output.points[1][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo3 = Thought226.getInstance(lb1, lb2, fb0, fb1);
    fd0 = fd1 + fd0;
    Thought lo4 = Thought216.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo5 = Thought312.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought175.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
          fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    if (ab4) {
        fd1 = fd0 + fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    Thought lo1 = Thought146.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    Thought lo3 = Thought212.getInstance();
    lb0 = !fb0;
    ad4 = fd0 + fd1;
    Thought lo4 = Thought59.getInstance(fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo5 = Thought227.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    boolean lb6 = true;
    Output.points[1][6] += ad3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 215.37740202690392;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    boolean lb1 = false;
    Output.points[1][7] -= ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 976.7258277782557;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = !fb0;
    Thought lo1 = Thought356.getInstance();
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] -= ld0;
    fd0 = fd1 - ld0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought273.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    Thought lo2 = Thought81.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
    double ld3 = 315.58840129145017;
    fb1 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    lb1 = ld3 < ad1;
    double ld4 = 61.46831711985482;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    Output.points[2][0] -= ld3;
    fb1 = !lb1;
    boolean lb5 = false;
    lb5 = ld4 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb5);
}
    fb0 = fd1 < ld3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, lb5, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}

Thought.STACK_COUNTER++;
return ld4;
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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    double ld0 = 927.2311331018072;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
if(ao3 != null){
      ab4 = ao3.m2();
}
    Output.points[2][1] += ld0;
    fb0 = !fb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought38.getInstance(lb1, lb2, ab1, ab2);
        ab3 = ab4 && fb0;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb1, lb2, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][2] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought57.getInstance();
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb1 = true;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
        Thought lo1 = Thought234.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
    Output.points[2][3] += fd1;
    fb1 = lb0 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;

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
    boolean lb0 = true;
    double ld1 = 599.3978842430768;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought335.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ld1 > fd0;
    ab3 = fd1 > ld1;
        Thought lo3 = Thought219.getInstance(ab4, fb0, fb1, lb0);
    double ld4 = 471.07361169254216;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Output.points[2][4] += ld4;
    double ld5 = 238.01906579112813;
    double ld6 = 638.4816400248758;
    ab2 = ld5 > ld6;
    double ld7 = 380.1928620940161;

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
    Thought lo0 = Thought80.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = true;
        fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !lb1;
    boolean lb2 = true;
    Thought lo3 = Thought380.getInstance();
    fd1 *= -1;
    Thought lo4 = Thought153.getInstance(lb2, fb0, fb1, lb1);
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
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
    ab2 = ad1 > ad2;
    ad3 *= -1;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought11.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Output.points[2][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
    ab3 = ab4 || fb0;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    ad2 *= -1;

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
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[2][6] += fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(ao1 != null){
          fd0 = ao1.m3();
}
        fd1 *= -1;
if(ao2 != null){
          ao2.m3(lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        Thought lo1 = Thought211.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
        double ld2 = 799.2959683230087;
        fb1 = !lb0;
        fb0 = fb1 && lb0;
        fd0 *= -1;
        Output.points[2][7] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        Thought lo3 = Thought123.getInstance(ao3, ao4, fo0, fo1);
        fb1 = ld2 < fd0;
        lb0 = fb0 || fb1;
        fd1 = ld2 + fd0;
        fd1 = ld2 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought252.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      fb1 = ao2.m2(lb1, fb0, fb1, lb1);
}
    fb0 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 *= -1;
    lb1 = fd0 < fd1;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      lb1 = ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        boolean lb2 = false;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb1);
}
        boolean lb3 = true;
        Thought lo4 = Thought86.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          lb1 = ao1.m2(fd1, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
}
Thought.STACK_COUNTER++;
return ao2;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    fd0 *= -1;
    double ld1 = 834.4965098189501;
    double ld2 = 415.42155178067145;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ld2, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought125.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
        fb0 = fb1 && ab1;
        }
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[2][8] -= fd1;
    Output.points[3][0] += ad1;
    double ld1 = 142.2844848109727;
    boolean lb2 = false;
    Output.points[3][1] -= ad1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
        Output.points[3][2] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought121.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld2 = 717.9030076915479;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    double ld3 = 596.1991684689986;
    double ld4 = 132.98811547227558;
    fb1 = !lb0;
    Thought lo5 = Thought287.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought99.getInstance(ld2, ld3, ld4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ld3, ld4);
}
    Thought lo7 = Thought385.getInstance();

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][3] += fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
        Output.points[3][4] -= fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
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
